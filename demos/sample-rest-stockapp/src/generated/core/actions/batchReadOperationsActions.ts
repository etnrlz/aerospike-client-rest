/*
 * WARNING: DO NOT EDIT THIS FILE. This file is generated by yarn gen. Any changes will be overwritten.
 */

import { ActionWithPayload } from './Action';
import { Action } from 'redux';
import { RestClientError } from '../api';
import SimpleResponse from '../types/SimpleResponse';

export const PERFORM_BATCH_GET_SUCCESSFUL = 'PERFORM_BATCH_GET_SUCCESSFUL';
export type PerformBatchGetSuccessful = ActionWithPayload<
    typeof PERFORM_BATCH_GET_SUCCESSFUL,
    SimpleResponse
>;

export const performBatchGetSuccessful = (res: SimpleResponse): PerformBatchGetSuccessful => ({
    type: PERFORM_BATCH_GET_SUCCESSFUL,
    payload: res,
});

export const PERFORM_BATCH_GET_FAILED = 'PERFORM_BATCH_GET_FAILED';
export type PerformBatchGetFailed = ActionWithPayload<
    typeof PERFORM_BATCH_GET_FAILED,
    RestClientError
>;

export const performBatchGetFailed = (res: RestClientError): PerformBatchGetFailed => ({
    type: PERFORM_BATCH_GET_FAILED,
    payload: res,
});

export const PERFORM_BATCH_GET_IN_PROGRESS = 'PERFORM_BATCH_GET_IN_PROGRESS';
export type PerformBatchGetInProgress = Action<typeof PERFORM_BATCH_GET_IN_PROGRESS>;

export const performBatchGetInProgress = (): PerformBatchGetInProgress => ({
    type: PERFORM_BATCH_GET_IN_PROGRESS,
});

export type PerformBatchGetAction =
    | PerformBatchGetSuccessful
    | PerformBatchGetFailed
    | PerformBatchGetInProgress;

export type BatchReadOperationsAction = PerformBatchGetAction;
