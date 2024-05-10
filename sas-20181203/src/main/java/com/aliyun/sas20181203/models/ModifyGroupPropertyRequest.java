// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyGroupPropertyRequest extends TeaModel {
    /**
     * <p>The new attributes of the server group. You can specify the following parameters to configure the attributes:</p>
     * <br>
     * <p>*   **groupFlag**: the type of the server group. Valid values: 0 and 1. The value **0** specifies the Default server group. The value **1** specifies other server groups.</p>
     * <p>*   **groupId**: the ID of the server group.</p>
     * <p>*   **groupIndex**: no meaning. You can leave this parameter empty.</p>
     * <p>*   **groupName**: the name of the server group. The value is the new name of the server group. The new name cannot be the same as the original name of the server group.</p>
     * <br>
     * <p>>  You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to obtain the values of the groupFlag and groupId parameters. You cannot change the value of the groupFlag or groupId parameter. You can change only the value of the groupName parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Data")
    public String data;

    public static ModifyGroupPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupPropertyRequest self = new ModifyGroupPropertyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGroupPropertyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
