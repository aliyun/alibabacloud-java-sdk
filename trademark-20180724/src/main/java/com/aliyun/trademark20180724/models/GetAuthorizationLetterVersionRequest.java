// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetAuthorizationLetterVersionRequest extends TeaModel {
    @NameInMap("OssKey")
    public String ossKey;

    public static GetAuthorizationLetterVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationLetterVersionRequest self = new GetAuthorizationLetterVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationLetterVersionRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

}
