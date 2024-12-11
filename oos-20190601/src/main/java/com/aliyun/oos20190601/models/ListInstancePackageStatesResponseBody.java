// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstancePackageStatesResponseBody extends TeaModel {
    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>Token string for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctzxxxxxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>List of extensions</p>
     */
    @NameInMap("PackageStates")
    public java.util.List<ListInstancePackageStatesResponseBodyPackageStates> packageStates;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1306108F-610C-40FD-AAD5-XXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstancePackageStatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancePackageStatesResponseBody self = new ListInstancePackageStatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancePackageStatesResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListInstancePackageStatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstancePackageStatesResponseBody setPackageStates(java.util.List<ListInstancePackageStatesResponseBodyPackageStates> packageStates) {
        this.packageStates = packageStates;
        return this;
    }
    public java.util.List<ListInstancePackageStatesResponseBodyPackageStates> getPackageStates() {
        return this.packageStates;
    }

    public ListInstancePackageStatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstancePackageStatesResponseBodyPackageStates extends TeaModel {
        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>template description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Parameters</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>Publisher</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud</p>
         */
        @NameInMap("Publisher")
        public String publisher;

        /**
         * <p>Template type</p>
         * 
         * <strong>example:</strong>
         * <p>Package</p>
         */
        @NameInMap("TemplateCategory")
        public String templateCategory;

        /**
         * <p>Template ID</p>
         * 
         * <strong>example:</strong>
         * <p>087b1e11072a40259f6fxxxxxxxxx</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>Template name.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-ECS-Docker</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>Template version number</p>
         * 
         * <strong>example:</strong>
         * <p>v3</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>Template version name</p>
         * 
         * <strong>example:</strong>
         * <p>fix bug</p>
         */
        @NameInMap("TemplateVersionName")
        public String templateVersionName;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-04T11:17:28</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListInstancePackageStatesResponseBodyPackageStates build(java.util.Map<String, ?> map) throws Exception {
            ListInstancePackageStatesResponseBodyPackageStates self = new ListInstancePackageStatesResponseBodyPackageStates();
            return TeaModel.build(map, self);
        }

        public ListInstancePackageStatesResponseBodyPackageStates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstancePackageStatesResponseBodyPackageStates setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListInstancePackageStatesResponseBodyPackageStates setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }
        public String getPublisher() {
            return this.publisher;
        }

        public ListInstancePackageStatesResponseBodyPackageStates setTemplateCategory(String templateCategory) {
            this.templateCategory = templateCategory;
            return this;
        }
        public String getTemplateCategory() {
            return this.templateCategory;
        }

        public ListInstancePackageStatesResponseBodyPackageStates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListInstancePackageStatesResponseBodyPackageStates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListInstancePackageStatesResponseBodyPackageStates setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListInstancePackageStatesResponseBodyPackageStates setTemplateVersionName(String templateVersionName) {
            this.templateVersionName = templateVersionName;
            return this;
        }
        public String getTemplateVersionName() {
            return this.templateVersionName;
        }

        public ListInstancePackageStatesResponseBodyPackageStates setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
