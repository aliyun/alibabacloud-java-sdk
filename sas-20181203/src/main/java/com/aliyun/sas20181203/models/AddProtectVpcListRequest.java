// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddProtectVpcListRequest extends TeaModel {
    /**
     * <p>Collection of new VPC instance IDs.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> interface to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vpc-bp1vnpgotyzay6p5i****&quot;,&quot;vpc-bp1vnpgotyzay6p5i****&quot;]</p>
     */
    @NameInMap("AddVpcInstanceIdList")
    public String addVpcInstanceIdList;

    /**
     * <p>Collection of VPC instance IDs to be deleted.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> interface to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vpc-bp1vnpgotyzay6p5i****&quot;,&quot;vpc-bp1vnpgotyzay6p5i****&quot;]</p>
     */
    @NameInMap("DelVpcInstanceIdList")
    public String delVpcInstanceIdList;

    public static AddProtectVpcListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProtectVpcListRequest self = new AddProtectVpcListRequest();
        return TeaModel.build(map, self);
    }

    public AddProtectVpcListRequest setAddVpcInstanceIdList(String addVpcInstanceIdList) {
        this.addVpcInstanceIdList = addVpcInstanceIdList;
        return this;
    }
    public String getAddVpcInstanceIdList() {
        return this.addVpcInstanceIdList;
    }

    public AddProtectVpcListRequest setDelVpcInstanceIdList(String delVpcInstanceIdList) {
        this.delVpcInstanceIdList = delVpcInstanceIdList;
        return this;
    }
    public String getDelVpcInstanceIdList() {
        return this.delVpcInstanceIdList;
    }

}
