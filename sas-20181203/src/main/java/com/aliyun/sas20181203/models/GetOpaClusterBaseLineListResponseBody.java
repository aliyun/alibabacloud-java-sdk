// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterBaseLineListResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about baselines.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetOpaClusterBaseLineListResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C2F2A020-1CAB-5F52-8CAF-B2ACDDFAC247</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOpaClusterBaseLineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpaClusterBaseLineListResponseBody self = new GetOpaClusterBaseLineListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpaClusterBaseLineListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOpaClusterBaseLineListResponseBody setData(java.util.List<GetOpaClusterBaseLineListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOpaClusterBaseLineListResponseBodyData> getData() {
        return this.data;
    }

    public GetOpaClusterBaseLineListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOpaClusterBaseLineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpaClusterBaseLineListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOpaClusterBaseLineListResponseBodyData extends TeaModel {
        /**
         * <p>The alias of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Make sure there are no duplicate usernames or UIDs</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The key of the baseline type.</p>
         * 
         * <strong>example:</strong>
         * <p>identification</p>
         */
        @NameInMap("ClassKey")
        public String classKey;

        /**
         * <p>The key of the name for the baseline check item.</p>
         * 
         * <strong>example:</strong>
         * <p>duplicate_uid</p>
         */
        @NameInMap("ItemKey")
        public String itemKey;

        /**
         * <p>The key of the name for the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>identification</p>
         */
        @NameInMap("NameKey")
        public String nameKey;

        public static GetOpaClusterBaseLineListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOpaClusterBaseLineListResponseBodyData self = new GetOpaClusterBaseLineListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOpaClusterBaseLineListResponseBodyData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetOpaClusterBaseLineListResponseBodyData setClassKey(String classKey) {
            this.classKey = classKey;
            return this;
        }
        public String getClassKey() {
            return this.classKey;
        }

        public GetOpaClusterBaseLineListResponseBodyData setItemKey(String itemKey) {
            this.itemKey = itemKey;
            return this;
        }
        public String getItemKey() {
            return this.itemKey;
        }

        public GetOpaClusterBaseLineListResponseBodyData setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

    }

}
