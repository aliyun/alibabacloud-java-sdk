// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineDetailRequest extends TeaModel {
    /**
     * <p>The information about the baseline.</p>
     */
    @NameInMap("BaselineItemKey")
    public String baselineItemKey;

    /**
     * <p>The UUID of the image.</p>
     */
    @NameInMap("ImageUuid")
    public String imageUuid;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeImageBaselineDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineDetailRequest self = new DescribeImageBaselineDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineDetailRequest setBaselineItemKey(String baselineItemKey) {
        this.baselineItemKey = baselineItemKey;
        return this;
    }
    public String getBaselineItemKey() {
        return this.baselineItemKey;
    }

    public DescribeImageBaselineDetailRequest setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
        return this;
    }
    public String getImageUuid() {
        return this.imageUuid;
    }

    public DescribeImageBaselineDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
