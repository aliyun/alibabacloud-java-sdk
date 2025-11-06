// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppViewTemplatesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ioeh****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Condition")
    public DescribeAppViewTemplatesRequestCondition condition;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeAppViewTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppViewTemplatesRequest self = new DescribeAppViewTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppViewTemplatesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAppViewTemplatesRequest setCondition(DescribeAppViewTemplatesRequestCondition condition) {
        this.condition = condition;
        return this;
    }
    public DescribeAppViewTemplatesRequestCondition getCondition() {
        return this.condition;
    }

    public DescribeAppViewTemplatesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeAppViewTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class DescribeAppViewTemplatesRequestCondition extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Bj6D****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static DescribeAppViewTemplatesRequestCondition build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppViewTemplatesRequestCondition self = new DescribeAppViewTemplatesRequestCondition();
            return TeaModel.build(map, self);
        }

        public DescribeAppViewTemplatesRequestCondition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppViewTemplatesRequestCondition setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
