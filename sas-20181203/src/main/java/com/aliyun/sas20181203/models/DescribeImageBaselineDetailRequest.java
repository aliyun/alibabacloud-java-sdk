// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineDetailRequest extends TeaModel {
    /**
     * <p>The information about the baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>Valid values include but are not limited to ak_leak, duplicate_uid, duplicate_pwd_hash, and non_pwd_user.</p>
     */
    @NameInMap("BaselineItemKey")
    public String baselineItemKey;

    /**
     * <p>The UUID of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>06293273b67d19516cfcc712194f****</p>
     */
    @NameInMap("ImageUuid")
    public String imageUuid;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
