// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetURLUploadInfosResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("URLUploadInfoList")
    @Validation(required = true)
    public java.util.List<GetURLUploadInfosResponseURLUploadInfoList> URLUploadInfoList;

    @NameInMap("NonExists")
    @Validation(required = true)
    public java.util.List<String> nonExists;

    public static GetURLUploadInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetURLUploadInfosResponse self = new GetURLUploadInfosResponse();
        return TeaModel.build(map, self);
    }

    public static class GetURLUploadInfosResponseURLUploadInfoList extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("UploadURL")
        @Validation(required = true)
        public String uploadURL;

        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("FileSize")
        @Validation(required = true)
        public String fileSize;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("UserData")
        @Validation(required = true)
        public String userData;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CompleteTime")
        @Validation(required = true)
        public String completeTime;

        public static GetURLUploadInfosResponseURLUploadInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetURLUploadInfosResponseURLUploadInfoList self = new GetURLUploadInfosResponseURLUploadInfoList();
            return TeaModel.build(map, self);
        }

    }

}
