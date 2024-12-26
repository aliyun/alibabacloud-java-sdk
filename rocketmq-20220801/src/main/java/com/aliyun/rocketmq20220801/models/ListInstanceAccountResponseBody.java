// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceAccountResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This parameter is returned only if the access is denied because the Resource Access Management (RAM) user does not have the required permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingInstanceId</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public ListInstanceAccountResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter instanceId is mandatory for this action .</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C115601B-8736-5BBF-AC99-7FEAE1245A80</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListInstanceAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAccountResponseBody self = new ListInstanceAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceAccountResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListInstanceAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceAccountResponseBody setData(ListInstanceAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstanceAccountResponseBodyData getData() {
        return this.data;
    }

    public ListInstanceAccountResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListInstanceAccountResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListInstanceAccountResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstanceAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstanceAccountResponseBodyDataList extends TeaModel {
        /**
         * <p>The status of the account.
         * Valid values:</p>
         * <ul>
         * <li>DISABLE</li>
         * <li>ENABLE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("accountStatus")
        public String accountStatus;

        /**
         * <p>The account type.</p>
         * <ul>
         * <li>CUSTOMER</li>
         * <li>DEFAULT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMER</p>
         */
        @NameInMap("accountType")
        public String accountType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The username of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("username")
        public String username;

        public static ListInstanceAccountResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceAccountResponseBodyDataList self = new ListInstanceAccountResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListInstanceAccountResponseBodyDataList setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public ListInstanceAccountResponseBodyDataList setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListInstanceAccountResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceAccountResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstanceAccountResponseBodyDataList setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListInstanceAccountResponseBodyData extends TeaModel {
        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("list")
        public java.util.List<ListInstanceAccountResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>Number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListInstanceAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceAccountResponseBodyData self = new ListInstanceAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceAccountResponseBodyData setList(java.util.List<ListInstanceAccountResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListInstanceAccountResponseBodyDataList> getList() {
            return this.list;
        }

        public ListInstanceAccountResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListInstanceAccountResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListInstanceAccountResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
