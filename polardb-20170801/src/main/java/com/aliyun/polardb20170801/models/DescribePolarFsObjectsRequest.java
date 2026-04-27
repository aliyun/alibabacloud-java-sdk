// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsObjectsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    public static DescribePolarFsObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsObjectsRequest self = new DescribePolarFsObjectsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsObjectsRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribePolarFsObjectsRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

}
