// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppStreamingOutTemplatesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Condition")
    public DescribeAppStreamingOutTemplatesRequestCondition condition;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeAppStreamingOutTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppStreamingOutTemplatesRequest self = new DescribeAppStreamingOutTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppStreamingOutTemplatesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAppStreamingOutTemplatesRequest setCondition(DescribeAppStreamingOutTemplatesRequestCondition condition) {
        this.condition = condition;
        return this;
    }
    public DescribeAppStreamingOutTemplatesRequestCondition getCondition() {
        return this.condition;
    }

    public DescribeAppStreamingOutTemplatesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeAppStreamingOutTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class DescribeAppStreamingOutTemplatesRequestCondition extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        public static DescribeAppStreamingOutTemplatesRequestCondition build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppStreamingOutTemplatesRequestCondition self = new DescribeAppStreamingOutTemplatesRequestCondition();
            return TeaModel.build(map, self);
        }

        public DescribeAppStreamingOutTemplatesRequestCondition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppStreamingOutTemplatesRequestCondition setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
