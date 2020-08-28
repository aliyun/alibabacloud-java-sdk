// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListCorpsResponseData data;

    public static ListCorpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCorpsResponse self = new ListCorpsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListCorpsResponseDataRecords extends TeaModel {
        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("CorpName")
        @Validation(required = true)
        public String corpName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("ParentCorpId")
        @Validation(required = true)
        public String parentCorpId;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("DeviceCount")
        @Validation(required = true)
        public Integer deviceCount;

        public static ListCorpsResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListCorpsResponseDataRecords self = new ListCorpsResponseDataRecords();
            return TeaModel.build(map, self);
        }

    }

    public static class ListCorpsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Integer totalPage;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<ListCorpsResponseDataRecords> records;

        public static ListCorpsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCorpsResponseData self = new ListCorpsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
