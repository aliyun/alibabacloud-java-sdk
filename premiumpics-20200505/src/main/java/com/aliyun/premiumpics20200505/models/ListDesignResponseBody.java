// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListDesignResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListDesignResponseBodyData> data;

    @NameInMap("DesignVersion")
    public String designVersion;

    @NameInMap("End")
    public Integer end;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Version")
    public String version;

    public static ListDesignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDesignResponseBody self = new ListDesignResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDesignResponseBody setData(java.util.List<ListDesignResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDesignResponseBodyData> getData() {
        return this.data;
    }

    public ListDesignResponseBody setDesignVersion(String designVersion) {
        this.designVersion = designVersion;
        return this;
    }
    public String getDesignVersion() {
        return this.designVersion;
    }

    public ListDesignResponseBody setEnd(Integer end) {
        this.end = end;
        return this;
    }
    public Integer getEnd() {
        return this.end;
    }

    public ListDesignResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDesignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDesignResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDesignResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class ListDesignResponseBodyDataTemplates extends TeaModel {
        @NameInMap("PreviewUrl")
        public String previewUrl;

        @NameInMap("TemplateId")
        public String templateId;

        public static ListDesignResponseBodyDataTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListDesignResponseBodyDataTemplates self = new ListDesignResponseBodyDataTemplates();
            return TeaModel.build(map, self);
        }

        public ListDesignResponseBodyDataTemplates setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public ListDesignResponseBodyDataTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class ListDesignResponseBodyData extends TeaModel {
        @NameInMap("GoodsId")
        public String goodsId;

        @NameInMap("Templates")
        public java.util.List<ListDesignResponseBodyDataTemplates> templates;

        public static ListDesignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDesignResponseBodyData self = new ListDesignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDesignResponseBodyData setGoodsId(String goodsId) {
            this.goodsId = goodsId;
            return this;
        }
        public String getGoodsId() {
            return this.goodsId;
        }

        public ListDesignResponseBodyData setTemplates(java.util.List<ListDesignResponseBodyDataTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<ListDesignResponseBodyDataTemplates> getTemplates() {
            return this.templates;
        }

    }

}
