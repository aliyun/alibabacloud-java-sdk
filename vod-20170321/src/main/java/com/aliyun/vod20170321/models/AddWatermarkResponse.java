// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWatermarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("WatermarkInfo")
    @Validation(required = true)
    public AddWatermarkResponseWatermarkInfo watermarkInfo;

    public static AddWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkResponse self = new AddWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public static class AddWatermarkResponseWatermarkInfo extends TeaModel {
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

        public static AddWatermarkResponseWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            AddWatermarkResponseWatermarkInfo self = new AddWatermarkResponseWatermarkInfo();
            return TeaModel.build(map, self);
        }

    }

}
