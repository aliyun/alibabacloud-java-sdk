// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DataCName extends TeaModel {
    @NameInMap("data_cname")
    public String dataCname;

    @NameInMap("location")
    public String location;

    public static DataCName build(java.util.Map<String, ?> map) throws Exception {
        DataCName self = new DataCName();
        return TeaModel.build(map, self);
    }

    public DataCName setDataCname(String dataCname) {
        this.dataCname = dataCname;
        return this;
    }
    public String getDataCname() {
        return this.dataCname;
    }

    public DataCName setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
