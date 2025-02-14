// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBatchUploadUrlRequest extends TeaModel {
    /**
     * <p>The identifiers of files. Only MD5 hash values are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Md5List")
    public java.util.List<String> md5List;

    /**
     * <p>The type of the file. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: unknown file</li>
     * <li><strong>1</strong>: binary file</li>
     * <li><strong>2</strong>: webshell file</li>
     * <li><strong>4</strong>: script file</li>
     * </ul>
     * <blockquote>
     * <p>If you do not know the type of the file, set this parameter to <strong>0</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static CreateBatchUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchUploadUrlRequest self = new CreateBatchUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchUploadUrlRequest setMd5List(java.util.List<String> md5List) {
        this.md5List = md5List;
        return this;
    }
    public java.util.List<String> getMd5List() {
        return this.md5List;
    }

    public CreateBatchUploadUrlRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
