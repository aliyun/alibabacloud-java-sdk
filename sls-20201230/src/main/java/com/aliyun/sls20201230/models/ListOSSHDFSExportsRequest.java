// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListOSSHDFSExportsRequest extends TeaModel {
    @NameInMap("logstore")
    public String logstore;

    @NameInMap("offset")
    public Integer offset;

    @NameInMap("size")
    public Integer size;

    public static ListOSSHDFSExportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOSSHDFSExportsRequest self = new ListOSSHDFSExportsRequest();
        return TeaModel.build(map, self);
    }

    public ListOSSHDFSExportsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListOSSHDFSExportsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListOSSHDFSExportsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
