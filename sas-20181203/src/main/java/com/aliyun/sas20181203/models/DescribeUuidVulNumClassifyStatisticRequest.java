// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUuidVulNumClassifyStatisticRequest extends TeaModel {
    /**
     * <p>Specifies whether to query image vulnerability statistics. Valid values:</p>
     * <ul>
     * <li>true: The Uuids parameter specifies image IDs.</li>
     * <li>false: The Uuids parameter specifies host UUIDs.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ImageVul")
    public Boolean imageVul;

    /**
     * <p>The unique identifier of the asset. If ImageVul is set to false, specify the host UUID. If ImageVul is set to true, specify the image ID. Separate multiple values with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>391abd09184cbd3743d7f5ec125d****,
     * e6aeb2a5b6004479398b0bcd1160****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeUuidVulNumClassifyStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUuidVulNumClassifyStatisticRequest self = new DescribeUuidVulNumClassifyStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUuidVulNumClassifyStatisticRequest setImageVul(Boolean imageVul) {
        this.imageVul = imageVul;
        return this;
    }
    public Boolean getImageVul() {
        return this.imageVul;
    }

    public DescribeUuidVulNumClassifyStatisticRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
