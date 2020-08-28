// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVodTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VodTemplateInfo")
    @Validation(required = true)
    public GetVodTemplateResponseVodTemplateInfo vodTemplateInfo;

    public static GetVodTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVodTemplateResponse self = new GetVodTemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class GetVodTemplateResponseVodTemplateInfo extends TeaModel {
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

        public static GetVodTemplateResponseVodTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVodTemplateResponseVodTemplateInfo self = new GetVodTemplateResponseVodTemplateInfo();
            return TeaModel.build(map, self);
        }

    }

}
