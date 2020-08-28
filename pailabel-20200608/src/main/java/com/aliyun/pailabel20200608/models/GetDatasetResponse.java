// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailabel20200608.models;

import com.aliyun.tea.*;

public class GetDatasetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrMsg")
    @Validation(required = true)
    public String errMsg;

    @NameInMap("ErrCode")
    @Validation(required = true)
    public Integer errCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDatasetResponseData data;

    public static GetDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetResponse self = new GetDatasetResponse();
        return TeaModel.build(map, self);
    }

    public static class GetDatasetResponseData extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

        @NameInMap("RegisterType")
        @Validation(required = true)
        public String registerType;

        @NameInMap("StoragePath")
        @Validation(required = true)
        public String storagePath;

        @NameInMap("DataType")
        @Validation(required = true)
        public String dataType;

        @NameInMap("SourcePath")
        @Validation(required = true)
        public String sourcePath;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("UtcModified")
        @Validation(required = true)
        public Long utcModified;

        @NameInMap("Uid")
        @Validation(required = true)
        public String uid;

        @NameInMap("TaskId")
        @Validation(required = true)
        public Long taskId;

        @NameInMap("TmpDownloadUrl")
        @Validation(required = true)
        public String tmpDownloadUrl;

        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<java.util.Map<String, ?>> tags;

        public static GetDatasetResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseData self = new GetDatasetResponseData();
            return TeaModel.build(map, self);
        }

    }

}
