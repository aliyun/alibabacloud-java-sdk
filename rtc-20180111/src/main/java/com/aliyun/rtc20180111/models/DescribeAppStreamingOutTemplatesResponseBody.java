// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppStreamingOutTemplatesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B0A2FCBC-43A4-428F-BC1D-3F4F85837F76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of templates.</p>
     */
    @NameInMap("Templates")
    public java.util.List<DescribeAppStreamingOutTemplatesResponseBodyTemplates> templates;

    /**
     * <p>Number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    /**
     * <p>Number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>Creation Time. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-04T06:22:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>List of layout IDs.</p>
         */
        @NameInMap("LayoutIds")
        public java.util.List<String> layoutIds;

        /**
         * <p>Encoding options.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        /**
         * <p>Template Name.</p>
         * 
         * <strong>example:</strong>
         * <p>模板名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Bj6D****</p>
         */
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
