// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListLogoSamplesResponseBody extends TeaModel {
    @NameInMap("Images")
    public java.util.List<String> images;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListLogoSamplesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogoSamplesResponseBody self = new ListLogoSamplesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogoSamplesResponseBody setImages(java.util.List<String> images) {
        this.images = images;
        return this;
    }
    public java.util.List<String> getImages() {
        return this.images;
    }

    public ListLogoSamplesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogoSamplesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
