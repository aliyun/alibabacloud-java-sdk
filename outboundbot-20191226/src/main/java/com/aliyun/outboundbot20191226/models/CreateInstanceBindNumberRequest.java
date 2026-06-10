// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateInstanceBindNumberRequest extends TeaModel {
    /**
     * <p>List of outbound calling instance IDs.</p>
     * <blockquote>
     * <p>Modifying this parameter overwrites previous parameters. Setting this parameter to empty clears the number binding list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>90515b5-6115-4ccf-83e2-52d5bfaf2ddf
     * ,123<em><strong><strong>09,456</strong></strong></em>08</p>
     */
    @NameInMap("InstanceList")
    public String instanceList;

    /**
     * <p>The number to bind (required).</p>
     * <blockquote>
     * <p>For the list of numbers, see the Number parameter returned by the ListAllTenantBindNumberBinding API.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15005059355</p>
     */
    @NameInMap("Number")
    public String number;

    public static CreateInstanceBindNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceBindNumberRequest self = new CreateInstanceBindNumberRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceBindNumberRequest setInstanceList(String instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public String getInstanceList() {
        return this.instanceList;
    }

    public CreateInstanceBindNumberRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

}
