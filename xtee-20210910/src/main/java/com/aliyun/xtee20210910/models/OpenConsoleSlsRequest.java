// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class OpenConsoleSlsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    @NameInMap("scene")
    public String scene;

    public static OpenConsoleSlsRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenConsoleSlsRequest self = new OpenConsoleSlsRequest();
        return TeaModel.build(map, self);
    }

    public OpenConsoleSlsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public OpenConsoleSlsRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public OpenConsoleSlsRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
