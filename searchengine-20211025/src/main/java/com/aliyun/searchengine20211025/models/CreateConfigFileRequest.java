// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateConfigFileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>/schemas/device_event_xt_schema.json</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>oss://xxx/xxxx/xxx</p>
     */
    @NameInMap("ossPath")
    public String ossPath;

    /**
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("parentFullPath")
    public String parentFullPath;

    public static CreateConfigFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigFileRequest self = new CreateConfigFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateConfigFileRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public CreateConfigFileRequest setParentFullPath(String parentFullPath) {
        this.parentFullPath = parentFullPath;
        return this;
    }
    public String getParentFullPath() {
        return this.parentFullPath;
    }

}
