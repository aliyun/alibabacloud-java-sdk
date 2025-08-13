// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDemoDownloadUrlRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
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
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Scene code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>coupon_abuse_detection</p>
     */
    @NameInMap("scene")
    public String scene;

    public static DescribeSampleDemoDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDemoDownloadUrlRequest self = new DescribeSampleDemoDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDemoDownloadUrlRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSampleDemoDownloadUrlRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSampleDemoDownloadUrlRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
