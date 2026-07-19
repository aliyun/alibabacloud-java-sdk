// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListRbacOrgTreeResponseBody extends TeaModel {
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
     * <p>or</p>
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
    public ListRbacOrgTreeResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh3BFw8paIJ7ylB6A7Qn9JjM</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
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

    /**
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListRbacOrgTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRbacOrgTreeResponseBody self = new ListRbacOrgTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRbacOrgTreeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListRbacOrgTreeResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListRbacOrgTreeResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListRbacOrgTreeResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListRbacOrgTreeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListRbacOrgTreeResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListRbacOrgTreeResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRbacOrgTreeResponseBody setModule(ListRbacOrgTreeResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListRbacOrgTreeResponseBodyModule getModule() {
        return this.module;
    }

    public ListRbacOrgTreeResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRbacOrgTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRbacOrgTreeResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListRbacOrgTreeResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListRbacOrgTreeResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListRbacOrgTreeResponseBodyModuleData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-05-08T02:28:26Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>FirstChildDepth</p>
         */
        @NameInMap("Depth")
        public Integer depth;

        /**
         * <strong>example:</strong>
         * <p>9953352</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>文件名</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        public static ListRbacOrgTreeResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            ListRbacOrgTreeResponseBodyModuleData self = new ListRbacOrgTreeResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public ListRbacOrgTreeResponseBodyModuleData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRbacOrgTreeResponseBodyModuleData setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public ListRbacOrgTreeResponseBodyModuleData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRbacOrgTreeResponseBodyModuleData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRbacOrgTreeResponseBodyModuleData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ListRbacOrgTreeResponseBodyModuleNext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-12-15T02:29:22Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Depth")
        public Integer depth;

        /**
         * <strong>example:</strong>
         * <p>1000039405002</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>docs</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>/h6sRMdP&amp;LTdQz/44ImvD/JtjSeUza/wVcp1i/dsxnl0FlL0/bvL/d+0~V6Fi5+R/P8ebktwGxe/l&amp;AqBD_/Y+TstdpTo06U_Q/4i4:EDPGo/7.fIVgd.//AOJtXP5/X</p>
         */
        @NameInMap("Path")
        public String path;

        public static ListRbacOrgTreeResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            ListRbacOrgTreeResponseBodyModuleNext self = new ListRbacOrgTreeResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public ListRbacOrgTreeResponseBodyModuleNext setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRbacOrgTreeResponseBodyModuleNext setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public ListRbacOrgTreeResponseBodyModuleNext setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRbacOrgTreeResponseBodyModuleNext setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRbacOrgTreeResponseBodyModuleNext setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ListRbacOrgTreeResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        @NameInMap("Data")
        public java.util.List<ListRbacOrgTreeResponseBodyModuleData> data;

        @NameInMap("Next")
        public ListRbacOrgTreeResponseBodyModuleNext next;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("NextPage")
        public Boolean nextPage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("PrePage")
        public Boolean prePage;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("ResultLimit")
        public Boolean resultLimit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalItemNum")
        public Integer totalItemNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPageNum")
        public Integer totalPageNum;

        public static ListRbacOrgTreeResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListRbacOrgTreeResponseBodyModule self = new ListRbacOrgTreeResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListRbacOrgTreeResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListRbacOrgTreeResponseBodyModule setData(java.util.List<ListRbacOrgTreeResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListRbacOrgTreeResponseBodyModuleData> getData() {
            return this.data;
        }

        public ListRbacOrgTreeResponseBodyModule setNext(ListRbacOrgTreeResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public ListRbacOrgTreeResponseBodyModuleNext getNext() {
            return this.next;
        }

        public ListRbacOrgTreeResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public ListRbacOrgTreeResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRbacOrgTreeResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public ListRbacOrgTreeResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public ListRbacOrgTreeResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public ListRbacOrgTreeResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
