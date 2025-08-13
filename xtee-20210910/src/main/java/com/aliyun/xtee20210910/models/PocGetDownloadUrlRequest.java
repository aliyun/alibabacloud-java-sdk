// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class PocGetDownloadUrlRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Task token.</p>
     * 
     * <strong>example:</strong>
     * <p>d83221f51752805880</p>
     */
    @NameInMap("Token")
    public String token;

    public static PocGetDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        PocGetDownloadUrlRequest self = new PocGetDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public PocGetDownloadUrlRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public PocGetDownloadUrlRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
