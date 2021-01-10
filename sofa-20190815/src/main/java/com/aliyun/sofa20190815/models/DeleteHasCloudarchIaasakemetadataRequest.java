// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchIaasakemetadataRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static DeleteHasCloudarchIaasakemetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchIaasakemetadataRequest self = new DeleteHasCloudarchIaasakemetadataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchIaasakemetadataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
