// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VodTemplateInfoList")
    @Validation(required = true)
    public java.util.List<ListVodTemplateResponseVodTemplateInfoList> vodTemplateInfoList;

    public static ListVodTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVodTemplateResponse self = new ListVodTemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class ListVodTemplateResponseVodTemplateInfoList extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("VodTemplateId")
        @Validation(required = true)
        public String vodTemplateId;

        @NameInMap("TemplateType")
        @Validation(required = true)
        public String templateType;

        @NameInMap("SubTemplateType")
        @Validation(required = true)
        public String subTemplateType;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public String isDefault;

        @NameInMap("TemplateConfig")
        @Validation(required = true)
        public String templateConfig;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        public static ListVodTemplateResponseVodTemplateInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListVodTemplateResponseVodTemplateInfoList self = new ListVodTemplateResponseVodTemplateInfoList();
            return TeaModel.build(map, self);
        }

    }

}
