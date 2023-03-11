// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClientConfStrategyRequest extends TeaModel {
    /**
     * <p>The tag that is added to the server.</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The value of the tag. Valid values:</p>
     * <br>
     * <p>*   major</p>
     * <p>*   advanced</p>
     * <p>*   basic</p>
     */
    @NameInMap("TagValue")
    public String tagValue;

    public static DescribeClientConfStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientConfStrategyRequest self = new DescribeClientConfStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClientConfStrategyRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DescribeClientConfStrategyRequest setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

}
