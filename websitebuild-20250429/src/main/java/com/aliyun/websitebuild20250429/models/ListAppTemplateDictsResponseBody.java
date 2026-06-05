// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppTemplateDictsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <strong>example:</strong>
     * <p>spring-cloud-b</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Module")
    public java.util.List<ListAppTemplateDictsResponseBodyModule> module;

    /**
     * <strong>example:</strong>
     * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh3BFw8paIJ7ylB6A7Qn9JjM</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListAppTemplateDictsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppTemplateDictsResponseBody self = new ListAppTemplateDictsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppTemplateDictsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAppTemplateDictsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAppTemplateDictsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppTemplateDictsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAppTemplateDictsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAppTemplateDictsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAppTemplateDictsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppTemplateDictsResponseBody setModule(java.util.List<ListAppTemplateDictsResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<ListAppTemplateDictsResponseBodyModule> getModule() {
        return this.module;
    }

    public ListAppTemplateDictsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppTemplateDictsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppTemplateDictsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAppTemplateDictsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAppTemplateDictsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAppTemplateDictsResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("DictCode")
        public String dictCode;

        /**
         * <strong>example:</strong>
         * <p>label</p>
         */
        @NameInMap("DictLabel")
        public String dictLabel;

        /**
         * <strong>example:</strong>
         * <p>product_version</p>
         */
        @NameInMap("DictType")
        public String dictType;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("DictValue")
        public String dictValue;

        @NameInMap("HasTemplates")
        public Boolean hasTemplates;

        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("SortOrder")
        public Integer sortOrder;

        public static ListAppTemplateDictsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAppTemplateDictsResponseBodyModule self = new ListAppTemplateDictsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAppTemplateDictsResponseBodyModule setDictCode(String dictCode) {
            this.dictCode = dictCode;
            return this;
        }
        public String getDictCode() {
            return this.dictCode;
        }

        public ListAppTemplateDictsResponseBodyModule setDictLabel(String dictLabel) {
            this.dictLabel = dictLabel;
            return this;
        }
        public String getDictLabel() {
            return this.dictLabel;
        }

        public ListAppTemplateDictsResponseBodyModule setDictType(String dictType) {
            this.dictType = dictType;
            return this;
        }
        public String getDictType() {
            return this.dictType;
        }

        public ListAppTemplateDictsResponseBodyModule setDictValue(String dictValue) {
            this.dictValue = dictValue;
            return this;
        }
        public String getDictValue() {
            return this.dictValue;
        }

        public ListAppTemplateDictsResponseBodyModule setHasTemplates(Boolean hasTemplates) {
            this.hasTemplates = hasTemplates;
            return this;
        }
        public Boolean getHasTemplates() {
            return this.hasTemplates;
        }

        public ListAppTemplateDictsResponseBodyModule setSortOrder(Integer sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Integer getSortOrder() {
            return this.sortOrder;
        }

    }

}
