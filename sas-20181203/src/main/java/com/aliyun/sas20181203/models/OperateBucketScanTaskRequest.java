// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateBucketScanTaskRequest extends TeaModel {
    /**
     * <p>The bucket name.</p>
     * 
     * <strong>example:</strong>
     * <p>iboxpublic****</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The operation to perform on the bucket. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Cancel detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OperateCode")
    public Integer operateCode;

    /**
     * <p>The business source. Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong>: OSS</li>
     * <li><strong>NAS</strong>: NAS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("Source")
    public String source;

    public static OperateBucketScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateBucketScanTaskRequest self = new OperateBucketScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public OperateBucketScanTaskRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public OperateBucketScanTaskRequest setOperateCode(Integer operateCode) {
        this.operateCode = operateCode;
        return this;
    }
    public Integer getOperateCode() {
        return this.operateCode;
    }

    public OperateBucketScanTaskRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
