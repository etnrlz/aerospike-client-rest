/*
 * WARNING: DO NOT EDIT THIS FILE. This file is generated by yarn gen. Any changes will be overwritten.
 */

import { ClusterInformation, RestClientError } from '../api';

export interface GetClusterInfoStateFields {
    /**
     * RestClientError
     */
    readonly errorValue: RestClientError;
    /**
     * ClusterInformation
     */
    readonly successValue: ClusterInformation;
    readonly inProgress: boolean;
}

export interface ClusterInformationOperationsStateFields {
    readonly getClusterInfo: GetClusterInfoStateFields;
}

export type ClusterInformationOperationsState = ClusterInformationOperationsStateFields;
