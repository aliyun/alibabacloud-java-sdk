// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperatorListBySceneRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    @NameInMap("scene")
    public String scene;

    public static DescribeOperatorListBySceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorListBySceneRequest self = new DescribeOperatorListBySceneRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorListBySceneRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOperatorListBySceneRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeOperatorListBySceneRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
