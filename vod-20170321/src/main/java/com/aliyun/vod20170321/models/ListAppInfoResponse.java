// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("AppInfoList")
    @Validation(required = true)
    public java.util.List<ListAppInfoResponseAppInfoList> appInfoList;

    public static ListAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfoResponse self = new ListAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAppInfoResponseAppInfoList extends TeaModel {
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

        public static ListAppInfoResponseAppInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAppInfoResponseAppInfoList self = new ListAppInfoResponseAppInfoList();
            return TeaModel.build(map, self);
        }

    }

}
