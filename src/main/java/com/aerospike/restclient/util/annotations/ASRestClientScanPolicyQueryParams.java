/*
 * Copyright 2020 Aerospike, Inc.
 *
 * Portions may be licensed to Aerospike, Inc. under one or more contributor
 * license agreements WHICH ARE COMPATIBLE WITH THE APACHE LICENSE, VERSION 2.0.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.aerospike.restclient.util.annotations;

import com.aerospike.restclient.util.AerospikeAPIConstants;
import com.aerospike.restclient.util.QueryParamDescriptors;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* Annotation which tells swagger to render all of the Scan Policy options as query parameters */
@ApiImplicitParams(value = {
        @ApiImplicitParam(
                name = AerospikeAPIConstants.SEND_KEY,
                dataType = "boolean",
                paramType = "query",
                value = QueryParamDescriptors.POLICY_SEND_KEY_NOTES,
                defaultValue = QueryParamDescriptors.POLICY_SEND_KEY_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.REPLICA,
                dataType = "string",
                paramType = "query",
                allowableValues = QueryParamDescriptors.POLICY_REPLICA_ALLOWABLE_VALUES,
                value = QueryParamDescriptors.POLICY_REPLICA_NOTES,
                defaultValue = QueryParamDescriptors.POLICY_REPLICA_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.KEY_TYPE,
                dataType = "string",
                paramType = "query",
                allowableValues = QueryParamDescriptors.KEYTYPE_ALLOWABLE_VALUES,
                defaultValue = QueryParamDescriptors.KEYTYPE_DEFAULT,
                value = QueryParamDescriptors.KEYTYPE_NOTES),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.RECORD_BINS,
                paramType = "query",
                value = QueryParamDescriptors.BINS_NOTES,
                dataType = "string", required = false, allowMultiple = true),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.READ_MODE_SC,
                dataType = "string",
                paramType = "query",
                allowableValues = QueryParamDescriptors.POLICY_READMODESC_ALLOWABLE_VALUES,
                value = QueryParamDescriptors.POLICY_READMODESC_NOTES,
                defaultValue = QueryParamDescriptors.POLICY_READMODESC_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.READ_MODE_AP,
                dataType = "string",
                paramType = "query",
                allowableValues = QueryParamDescriptors.POLICY_READMODEAP_ALLOWABLE_VALUES,
                value = QueryParamDescriptors.POLICY_READMODEAP_NOTES,
                defaultValue = QueryParamDescriptors.POLICY_READMODEAP_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.TOTAL_TIMEOUT,
                dataType = "int",
                paramType = "query",
                value = QueryParamDescriptors.POLICY_TOTAL_TIMEOUT_NOTES,
                defaultValue = QueryParamDescriptors.POLICY_TOTAL_TIMEOUT_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.SOCKET_TIMEOUT,
                dataType = "int",
                paramType = "query",
                value = QueryParamDescriptors.POLICY_SOCKET_TIMEOUT_NOTES,
                defaultValue = QueryParamDescriptors.POLICY_SOCKET_TIMEOUT_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.SLEEP_BETWEEN_RETRIES,
                dataType = "int",
                paramType = "query",
                value = QueryParamDescriptors.POLICY_SLEEP_BETWEEN_RETRIES_NOTES,
                defaultValue = QueryParamDescriptors.POLICY_SLEEP_BETWEEN_RETRIES_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.MAX_RETRIES,
                dataType = "int",
                paramType = "query",
                value = QueryParamDescriptors.POLICY_MAX_RETRIES_NOTES,
                defaultValue = QueryParamDescriptors.POLICY_MAX_RETRIES_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.PRED_EXP,
                dataType = "string",
                paramType = "query",
                allowableValues = QueryParamDescriptors.POLICY_PRED_EXP_ALLOWABLE_VALUES,
                value = QueryParamDescriptors.POLICY_PRED_EXP_NOTES,
                defaultValue = QueryParamDescriptors.POLICY_PRED_EXP_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.COMPRESS,
                dataType = "boolean",
                paramType = "query",
                value = QueryParamDescriptors.POLICY_COMPRESS_NOTES,
                defaultValue = QueryParamDescriptors.POLICY_COMPRESS_DEFAULT),

        // Scan Operation Policies
        @ApiImplicitParam(
                name = AerospikeAPIConstants.MAX_RECORDS,
                dataType = "int",
                paramType = "query",
                value = QueryParamDescriptors.SCAN_POLICY_MAX_RECORDS_NOTES,
                defaultValue = QueryParamDescriptors.SCAN_POLICY_MAX_RECORDS_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.SCAN_PERCENT,
                dataType = "int",
                paramType = "query",
                value = QueryParamDescriptors.SCAN_POLICY_SCAN_PERCENT_NOTES,
                defaultValue = QueryParamDescriptors.SCAN_POLICY_SCAN_PERCENT_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.RECORDS_PER_SECOND,
                dataType = "int",
                paramType = "query",
                value = QueryParamDescriptors.SCAN_POLICY_RECORDS_PER_SECOND_NOTES,
                defaultValue = QueryParamDescriptors.SCAN_POLICY_RECORDS_PER_SECOND_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.MAX_CONCURRENT_NODES,
                dataType = "int",
                paramType = "query",
                value = QueryParamDescriptors.SCAN_POLICY_MAX_CONCURRENT_NODES_NOTES,
                defaultValue = QueryParamDescriptors.SCAN_POLICY_MAX_CONCURRENT_NODES_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.CONCURRENT_NODES,
                dataType = "boolean",
                paramType = "query",
                value = QueryParamDescriptors.SCAN_POLICY_CONCURRENT_NODES_NOTES,
                defaultValue = QueryParamDescriptors.SCAN_POLICY_CONCURRENT_NODES_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.INCLUDE_BIN_DATA,
                dataType = "boolean",
                paramType = "query",
                value = QueryParamDescriptors.SCAN_POLICY_INCLUDE_BIN_DATA_NOTES,
                defaultValue = QueryParamDescriptors.SCAN_POLICY_INCLUDE_BIN_DATA_DEFAULT),
        @ApiImplicitParam(
                name = AerospikeAPIConstants.FAIL_ON_CLUSTER_CHANGE,
                dataType = "boolean",
                paramType = "query",
                value = QueryParamDescriptors.SCAN_POLICY_FAIL_ON_CLUSTER_CHANGE_NOTES,
                defaultValue = QueryParamDescriptors.SCAN_POLICY_FAIL_ON_CLUSTER_CHANGE_DEFAULT),

        // Scan parameters
        @ApiImplicitParam(
                name = AerospikeAPIConstants.FROM_TOKEN,
                dataType = "string",
                paramType = "query",
                value = QueryParamDescriptors.SCAN_FROM_TOKEN_NOTES,
                defaultValue = QueryParamDescriptors.SCAN_FROM_TOKEN_DEFAULT),
})
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ASRestClientScanPolicyQueryParams {
}
