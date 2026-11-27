// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppRecordTemplatesRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The idempotency parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The query conditions.</p>
     */
    @NameInMap("Condition")
    public DescribeAppRecordTemplatesRequestCondition condition;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeAppRecordTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppRecordTemplatesRequest self = new DescribeAppRecordTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppRecordTemplatesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAppRecordTemplatesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeAppRecordTemplatesRequest setCondition(DescribeAppRecordTemplatesRequestCondition condition) {
        this.condition = condition;
        return this;
    }
    public DescribeAppRecordTemplatesRequestCondition getCondition() {
        return this.condition;
    }

    public DescribeAppRecordTemplatesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeAppRecordTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class DescribeAppRecordTemplatesRequestCondition extends TeaModel {
        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ac7N****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static DescribeAppRecordTemplatesRequestCondition build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppRecordTemplatesRequestCondition self = new DescribeAppRecordTemplatesRequestCondition();
            return TeaModel.build(map, self);
        }

        public DescribeAppRecordTemplatesRequestCondition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppRecordTemplatesRequestCondition setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
