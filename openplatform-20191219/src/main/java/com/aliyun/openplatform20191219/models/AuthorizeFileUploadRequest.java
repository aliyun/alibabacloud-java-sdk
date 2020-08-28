// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openplatform20191219.models;

import com.aliyun.tea.*;

public class AuthorizeFileUploadRequest extends TeaModel {
    @NameInMap("Product")
    @Validation(required = true)
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    public static AuthorizeFileUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeFileUploadRequest self = new AuthorizeFileUploadRequest();
        return TeaModel.build(map, self);
    }

}
