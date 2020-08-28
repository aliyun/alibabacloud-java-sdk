// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegisterMediaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegisteredMediaList")
    @Validation(required = true)
    public java.util.List<RegisterMediaResponseRegisteredMediaList> registeredMediaList;

    @NameInMap("FailedFileURLs")
    @Validation(required = true)
    public java.util.List<String> failedFileURLs;

    public static RegisterMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaResponse self = new RegisterMediaResponse();
        return TeaModel.build(map, self);
    }

    public static class RegisterMediaResponseRegisteredMediaList extends TeaModel {
        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("FileURL")
        @Validation(required = true)
        public String fileURL;

        @NameInMap("NewRegister")
        @Validation(required = true)
        public Boolean newRegister;

        public static RegisterMediaResponseRegisteredMediaList build(java.util.Map<String, ?> map) throws Exception {
            RegisterMediaResponseRegisteredMediaList self = new RegisterMediaResponseRegisteredMediaList();
            return TeaModel.build(map, self);
        }

    }

}
