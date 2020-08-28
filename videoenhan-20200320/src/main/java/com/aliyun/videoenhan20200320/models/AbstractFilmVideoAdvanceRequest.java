// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractFilmVideoAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("Length")
    @Validation(required = true)
    public Integer length;

    public static AbstractFilmVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AbstractFilmVideoAdvanceRequest self = new AbstractFilmVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
