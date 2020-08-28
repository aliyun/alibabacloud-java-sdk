// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RecognizeImageRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("PicContent")
    @Validation(required = true)
    public String picContent;

    @NameInMap("PicFormat")
    @Validation(required = true)
    public String picFormat;

    public static RecognizeImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageRequest self = new RecognizeImageRequest();
        return TeaModel.build(map, self);
    }

}
