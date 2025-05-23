/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.organization.user.sharing.management.common.constants;

/**
 * Holds the constants which the user sharing management API component is using.
 */
public class UserSharingMgtConstants {

    public static final String ERROR_PREFIX = "USM-";

    public static final String USER_IDS = "userIds";

    public static final String RESPONSE_STATUS_PROCESSING = "Processing";
    public static final String RESPONSE_DETAIL_USER_SHARE = "User sharing process triggered successfully.";
    public static final String RESPONSE_DETAIL_USER_UNSHARE = "User unsharing process triggered successfully.";

    /**
     * Enum for user sharing management related errors.
     * Error Code - code to identify the error.
     * Error Message - What went wrong.
     * Error Description - Why it went wrong.
     */
    public enum ErrorMessage {

        // Client errors.
        INVALID_SELECTIVE_USER_SHARE_REQUEST_BODY("60000",
                "Invalid selective user share request body.",
                "The user criteria provided for selective sharing is either null or empty. " +
                        "Please provide valid selective user sharing criteria."),
        INVALID_GENERAL_USER_SHARE_REQUEST_BODY("60001",
                "Invalid general user share request body.",
                "The user criteria provided for general sharing is either null or empty. " +
                        "Please provide valid general user sharing criteria."),
        INVALID_SELECTIVE_USER_UNSHARE_REQUEST_BODY("60002",
                "Invalid selective user unshare request body.",
                "The user criteria provided for selective unsharing is either null or empty. " +
                        "Please provide valid selective user unsharing criteria."),
        INVALID_GENERAL_USER_UNSHARE_REQUEST_BODY("60003",
                "Invalid general user unshare request body.",
                "The user criteria provided for general unsharing is either null or empty. " +
                        "Please provide valid general user unsharing criteria."),
        INVALID_UUID_FORMAT("60004",
                "Invalid UUID format.",
                "The UUID provided in the request is not in a valid format. " +
                        "Please provide a valid UUID."),

        // Server errors.
        ERROR_INITIATING_USERS_API_SERVICE("65001",
                "Error initiating UsersApiService.",
                "Error occurred while initiating UsersApiService.");

        private final String code;
        private final String message;
        private final String description;

        ErrorMessage(String code, String message, String description) {

            this.code = code;
            this.message = message;
            this.description = description;
        }

        public String getCode() {

            return ERROR_PREFIX + code;
        }

        public String getMessage() {

            return message;
        }

        public String getDescription() {

            return description;
        }

        @Override
        public String toString() {

            return code + " | " + message;
        }
    }
}
