// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWatermarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("WatermarkInfo")
    @Validation(required = true)
    public GetWatermarkResponseWatermarkInfo watermarkInfo;

    public static GetWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkResponse self = new GetWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public static class GetWatermarkResponseWatermarkInfo extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public String isDefault;

        @NameInMap("WatermarkId")
        @Validation(required = true)
        public String watermarkId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("FileUrl")
        @Validation(required = true)
        public String fileUrl;

        @NameInMap("WatermarkConfig")
        @Validation(required = true)
        public String watermarkConfig;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        public static GetWatermarkResponseWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarkResponseWatermarkInfo self = new GetWatermarkResponseWatermarkInfo();
            return TeaModel.build(map, self);
        }

    }

}
