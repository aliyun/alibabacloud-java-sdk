// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class GetWhiteBoardProfileCallbackRequest extends TeaModel {
    @NameInMap("DocKey")
    public String docKey;

    public static GetWhiteBoardProfileCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWhiteBoardProfileCallbackRequest self = new GetWhiteBoardProfileCallbackRequest();
        return TeaModel.build(map, self);
    }

    public GetWhiteBoardProfileCallbackRequest setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

}
