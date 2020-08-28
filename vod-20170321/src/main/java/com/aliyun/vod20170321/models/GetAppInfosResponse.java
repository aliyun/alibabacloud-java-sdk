// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAppInfosResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AppInfoList")
    @Validation(required = true)
    public java.util.List<GetAppInfosResponseAppInfoList> appInfoList;

    @NameInMap("NonExistAppIds")
    @Validation(required = true)
    public java.util.List<String> nonExistAppIds;

    public static GetAppInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppInfosResponse self = new GetAppInfosResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAppInfosResponseAppInfoList extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        public static GetAppInfosResponseAppInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetAppInfosResponseAppInfoList self = new GetAppInfosResponseAppInfoList();
            return TeaModel.build(map, self);
        }

    }

}
