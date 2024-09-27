// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ListAccessTokensResponseBody extends TeaModel {
    /**
     * <p>The activation codes returned.</p>
     */
    @NameInMap("AccessTokens")
    public ListAccessTokensResponseBodyAccessTokens accessTokens;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li>10</li>
     * <li>20</li>
     * <li>50</li>
     * </ul>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E2DA3097-79B9-53AE-B0DF-281DC54F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of migration sources returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAccessTokensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessTokensResponseBody self = new ListAccessTokensResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessTokensResponseBody setAccessTokens(ListAccessTokensResponseBodyAccessTokens accessTokens) {
        this.accessTokens = accessTokens;
        return this;
    }
    public ListAccessTokensResponseBodyAccessTokens getAccessTokens() {
        return this.accessTokens;
    }

    public ListAccessTokensResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAccessTokensResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccessTokensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccessTokensResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAccessTokensResponseBodyAccessTokensAccessToken extends TeaModel {
        /**
         * <p>The ID of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>at-bp1akz2zp67r0k6r****</p>
         */
        @NameInMap("AccessTokenId")
        public String accessTokenId;

        /**
         * <p>The maximum number of times that the activation code can be used. Valid values: 1 to 1000.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The time when the activation code was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-09T02:35:44Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>This is an activation code</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of migration sources whose information has been imported to Server Migration Center (SMC) by using the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RegisteredCount")
        public String registeredCount;

        /**
         * <p>The status of the activation code. Valid values:</p>
         * <ul>
         * <li>activated</li>
         * <li>unactivated</li>
         * <li>expired</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>activated</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The validity period of the activation code. Unit: day. Valid values: 1 to 90. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TimeToLiveInDays")
        public String timeToLiveInDays;

        public static ListAccessTokensResponseBodyAccessTokensAccessToken build(java.util.Map<String, ?> map) throws Exception {
            ListAccessTokensResponseBodyAccessTokensAccessToken self = new ListAccessTokensResponseBodyAccessTokensAccessToken();
            return TeaModel.build(map, self);
        }

        public ListAccessTokensResponseBodyAccessTokensAccessToken setAccessTokenId(String accessTokenId) {
            this.accessTokenId = accessTokenId;
            return this;
        }
        public String getAccessTokenId() {
            return this.accessTokenId;
        }

        public ListAccessTokensResponseBodyAccessTokensAccessToken setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public ListAccessTokensResponseBodyAccessTokensAccessToken setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAccessTokensResponseBodyAccessTokensAccessToken setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAccessTokensResponseBodyAccessTokensAccessToken setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAccessTokensResponseBodyAccessTokensAccessToken setRegisteredCount(String registeredCount) {
            this.registeredCount = registeredCount;
            return this;
        }
        public String getRegisteredCount() {
            return this.registeredCount;
        }

        public ListAccessTokensResponseBodyAccessTokensAccessToken setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAccessTokensResponseBodyAccessTokensAccessToken setTimeToLiveInDays(String timeToLiveInDays) {
            this.timeToLiveInDays = timeToLiveInDays;
            return this;
        }
        public String getTimeToLiveInDays() {
            return this.timeToLiveInDays;
        }

    }

    public static class ListAccessTokensResponseBodyAccessTokens extends TeaModel {
        @NameInMap("AccessToken")
        public java.util.List<ListAccessTokensResponseBodyAccessTokensAccessToken> accessToken;

        public static ListAccessTokensResponseBodyAccessTokens build(java.util.Map<String, ?> map) throws Exception {
            ListAccessTokensResponseBodyAccessTokens self = new ListAccessTokensResponseBodyAccessTokens();
            return TeaModel.build(map, self);
        }

        public ListAccessTokensResponseBodyAccessTokens setAccessToken(java.util.List<ListAccessTokensResponseBodyAccessTokensAccessToken> accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public java.util.List<ListAccessTokensResponseBodyAccessTokensAccessToken> getAccessToken() {
            return this.accessToken;
        }

    }

}
