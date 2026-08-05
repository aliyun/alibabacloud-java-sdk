// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListCredentialsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>33E4F0CA-F766-5803-B11C-70DC57A5A6E4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public java.util.List<ListCredentialsResponseBodyResult> result;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsResponseBody self = new ListCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCredentialsResponseBody setResult(java.util.List<ListCredentialsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListCredentialsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListCredentialsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCredentialsResponseBodyResult extends TeaModel {
        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("appGroupId")
        public Long appGroupId;

        /**
         * <p>Indicates whether the credential is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The access credential token.</p>
         * 
         * <strong>example:</strong>
         * <p>OS-****</p>
         */
        @NameInMap("token")
        public String token;

        /**
         * <p>The credential type.</p>
         * <ul>
         * <li>api-token.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>api-token</p>
         */
        @NameInMap("type")
        public String type;

        public static ListCredentialsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCredentialsResponseBodyResult self = new ListCredentialsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCredentialsResponseBodyResult setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        public ListCredentialsResponseBodyResult setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListCredentialsResponseBodyResult setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public ListCredentialsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
