// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CreateYydDataSetRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("ossFileName")
    public String ossFileName;

    public static CreateYydDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateYydDataSetRequest self = new CreateYydDataSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateYydDataSetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateYydDataSetRequest setOssFileName(String ossFileName) {
        this.ossFileName = ossFileName;
        return this;
    }
    public String getOssFileName() {
        return this.ossFileName;
    }

}
