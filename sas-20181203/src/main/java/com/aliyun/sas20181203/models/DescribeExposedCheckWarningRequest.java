// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedCheckWarningRequest extends TeaModel {
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

    /**
     * <p>The type of the baseline.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to obtain the types of baselines from the response parameter <strong>TypeName</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>weak_password</p>
     */
    @NameInMap("TypeName")
    public String typeName;

    /**
     * <p>The UUID of the server. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6541631a-7d47-41fd-9fef-9518113f****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeExposedCheckWarningRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedCheckWarningRequest self = new DescribeExposedCheckWarningRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExposedCheckWarningRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeExposedCheckWarningRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public DescribeExposedCheckWarningRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
