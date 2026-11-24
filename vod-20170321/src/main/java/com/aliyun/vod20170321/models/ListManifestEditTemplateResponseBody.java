// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListManifestEditTemplateResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The position returned by the current call. An empty value indicates that all data has been retrieved.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>page_2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of ManifestEdit templates.</p>
     */
    @NameInMap("TemplateList")
    public java.util.List<ListManifestEditTemplateResponseBodyTemplateList> templateList;

    /**
     * <p>The total number of entries that meet the current request conditions. This parameter is optional and is not returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListManifestEditTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListManifestEditTemplateResponseBody self = new ListManifestEditTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListManifestEditTemplateResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListManifestEditTemplateResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListManifestEditTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListManifestEditTemplateResponseBody setTemplateList(java.util.List<ListManifestEditTemplateResponseBodyTemplateList> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<ListManifestEditTemplateResponseBodyTemplateList> getTemplateList() {
        return this.templateList;
    }

    public ListManifestEditTemplateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListManifestEditTemplateResponseBodyTemplateList extends TeaModel {
        /**
         * <p>The application ID. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multiple applications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The creation time. The time follows the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-10T08:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The modification time. The time follows the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-10T08:00:00Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The name of the track template group.</p>
         * 
         * <strong>example:</strong>
         * <p>multilang-tracks</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The template status. A value of <strong>1</strong> indicates enabled, and a value of <strong>0</strong> indicates disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ManifestEdit template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9c6581d59240de5e258ffa4c71a3e01b</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static ListManifestEditTemplateResponseBodyTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ListManifestEditTemplateResponseBodyTemplateList self = new ListManifestEditTemplateResponseBodyTemplateList();
            return TeaModel.build(map, self);
        }

        public ListManifestEditTemplateResponseBodyTemplateList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListManifestEditTemplateResponseBodyTemplateList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListManifestEditTemplateResponseBodyTemplateList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListManifestEditTemplateResponseBodyTemplateList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListManifestEditTemplateResponseBodyTemplateList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListManifestEditTemplateResponseBodyTemplateList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
