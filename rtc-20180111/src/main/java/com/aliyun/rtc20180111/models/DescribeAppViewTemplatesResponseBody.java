// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppViewTemplatesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B0A2FCBC-43A4-428F-BC1D-3F4F85837F76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<DescribeAppViewTemplatesResponseBodyTemplates> templates;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Long totalPage;

    public static DescribeAppViewTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppViewTemplatesResponseBody self = new DescribeAppViewTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppViewTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppViewTemplatesResponseBody setTemplates(java.util.List<DescribeAppViewTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<DescribeAppViewTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public DescribeAppViewTemplatesResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeAppViewTemplatesResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeAppViewTemplatesResponseBodyTemplates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-09-04T06:22:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("LayoutIds")
        public java.util.List<String> layoutIds;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        /**
         * <strong>example:</strong>
         * <p>模版名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Bj6D****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static DescribeAppViewTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppViewTemplatesResponseBodyTemplates self = new DescribeAppViewTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeAppViewTemplatesResponseBodyTemplates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAppViewTemplatesResponseBodyTemplates setLayoutIds(java.util.List<String> layoutIds) {
            this.layoutIds = layoutIds;
            return this;
        }
        public java.util.List<String> getLayoutIds() {
            return this.layoutIds;
        }

        public DescribeAppViewTemplatesResponseBodyTemplates setMediaEncode(Integer mediaEncode) {
            this.mediaEncode = mediaEncode;
            return this;
        }
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        public DescribeAppViewTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppViewTemplatesResponseBodyTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
