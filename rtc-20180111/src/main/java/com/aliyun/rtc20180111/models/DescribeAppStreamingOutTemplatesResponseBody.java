// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppStreamingOutTemplatesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<DescribeAppStreamingOutTemplatesResponseBodyTemplates> templates;

    @NameInMap("TotalNum")
    public Long totalNum;

    @NameInMap("TotalPage")
    public Long totalPage;

    public static DescribeAppStreamingOutTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppStreamingOutTemplatesResponseBody self = new DescribeAppStreamingOutTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppStreamingOutTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppStreamingOutTemplatesResponseBody setTemplates(java.util.List<DescribeAppStreamingOutTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<DescribeAppStreamingOutTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public DescribeAppStreamingOutTemplatesResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeAppStreamingOutTemplatesResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeAppStreamingOutTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("LayoutIds")
        public java.util.List<String> layoutIds;

        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        public static DescribeAppStreamingOutTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppStreamingOutTemplatesResponseBodyTemplates self = new DescribeAppStreamingOutTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeAppStreamingOutTemplatesResponseBodyTemplates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAppStreamingOutTemplatesResponseBodyTemplates setLayoutIds(java.util.List<String> layoutIds) {
            this.layoutIds = layoutIds;
            return this;
        }
        public java.util.List<String> getLayoutIds() {
            return this.layoutIds;
        }

        public DescribeAppStreamingOutTemplatesResponseBodyTemplates setMediaEncode(Integer mediaEncode) {
            this.mediaEncode = mediaEncode;
            return this;
        }
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        public DescribeAppStreamingOutTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppStreamingOutTemplatesResponseBodyTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
