// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListAuthConfigByResourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FA14C-ED6B-5F39-8563-855676470C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The collection of authorization details.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListAuthConfigByResourceResponseBodyResult> result;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAuthConfigByResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthConfigByResourceResponseBody self = new ListAuthConfigByResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthConfigByResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthConfigByResourceResponseBody setResult(java.util.List<ListAuthConfigByResourceResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAuthConfigByResourceResponseBodyResult> getResult() {
        return this.result;
    }

    public ListAuthConfigByResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAuthConfigByResourceResponseBodyResult extends TeaModel {
        /**
         * <p>The array of permissions granted.</p>
         */
        @NameInMap("Authorities")
        public java.util.List<String> authorities;

        /**
         * <p>The ID of the authorized user.</p>
         * 
         * <strong>example:</strong>
         * <p>123123**dfsd</p>
         */
        @NameInMap("AuthorizedId")
        public String authorizedId;

        /**
         * <p>The name of the authorized user.</p>
         * 
         * <strong>example:</strong>
         * <p>sss</p>
         */
        @NameInMap("AuthorizedName")
        public String authorizedName;

        /**
         * <p>The expiration time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1788969600000</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>The time when the permission record was created, in the yyyy-MM-dd mm:hh:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-16 13:17:39</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123**dfsd</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>dashboard: dashboard</li>
         * <li>screen: data screen</li>
         * <li>report: electron</li>
         * <li>ANALYSIS: ad hoc analysis</li>
         * <li>dashboardOfflineQuery: self-service data retrieval</li>
         * <li>dataForm: data form</li>
         * <li>cube: dataset</li>
         * <li>datasource: data source</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cube</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The authorization scope. Valid values:</p>
         * <ul>
         * <li>0: user</li>
         * <li>1: user group</li>
         * <li>2: organization</li>
         * <li>3: workspace</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Scope")
        public Integer scope;

        public static ListAuthConfigByResourceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAuthConfigByResourceResponseBodyResult self = new ListAuthConfigByResourceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAuthConfigByResourceResponseBodyResult setAuthorities(java.util.List<String> authorities) {
            this.authorities = authorities;
            return this;
        }
        public java.util.List<String> getAuthorities() {
            return this.authorities;
        }

        public ListAuthConfigByResourceResponseBodyResult setAuthorizedId(String authorizedId) {
            this.authorizedId = authorizedId;
            return this;
        }
        public String getAuthorizedId() {
            return this.authorizedId;
        }

        public ListAuthConfigByResourceResponseBodyResult setAuthorizedName(String authorizedName) {
            this.authorizedName = authorizedName;
            return this;
        }
        public String getAuthorizedName() {
            return this.authorizedName;
        }

        public ListAuthConfigByResourceResponseBodyResult setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public ListAuthConfigByResourceResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAuthConfigByResourceResponseBodyResult setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListAuthConfigByResourceResponseBodyResult setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListAuthConfigByResourceResponseBodyResult setScope(Integer scope) {
            this.scope = scope;
            return this;
        }
        public Integer getScope() {
            return this.scope;
        }

    }

}
