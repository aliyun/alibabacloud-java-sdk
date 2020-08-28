// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListWatermarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("WatermarkInfos")
    @Validation(required = true)
    public java.util.List<ListWatermarkResponseWatermarkInfos> watermarkInfos;

    public static ListWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWatermarkResponse self = new ListWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public static class ListWatermarkResponseWatermarkInfos extends TeaModel {
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

        public static ListWatermarkResponseWatermarkInfos build(java.util.Map<String, ?> map) throws Exception {
            ListWatermarkResponseWatermarkInfos self = new ListWatermarkResponseWatermarkInfos();
            return TeaModel.build(map, self);
        }

    }

}
