// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateModelRequest extends TeaModel {
    /**
     * <p>Submitter ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WB01160353</p>
     */
    @NameInMap("BucId")
    public String bucId;

    /**
     * <p>Number of file rows.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Counts")
    public String counts;

    /**
     * <p>File MD5 value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VC6Sj3u138yfWHLxLl7dtA==</p>
     */
    @NameInMap("FileMD5")
    public String fileMD5;

    /**
     * <p>File path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tempCache/ef2387dfb357ffe87925fd51d2b5305b/1665717035328/mockData.csv</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>Model name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>Model scenario.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>saf_ai_account_abuse</p>
     */
    @NameInMap("ModelScene")
    public String modelScene;

    /**
     * <p>Number of file columns.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ParameterNum")
    public String parameterNum;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>Uploaded file name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fileTest</p>
     */
    @NameInMap("UserLocalFileName")
    public String userLocalFileName;

    public static CreateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelRequest self = new CreateModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelRequest setBucId(String bucId) {
        this.bucId = bucId;
        return this;
    }
    public String getBucId() {
        return this.bucId;
    }

    public CreateModelRequest setCounts(String counts) {
        this.counts = counts;
        return this;
    }
    public String getCounts() {
        return this.counts;
    }

    public CreateModelRequest setFileMD5(String fileMD5) {
        this.fileMD5 = fileMD5;
        return this;
    }
    public String getFileMD5() {
        return this.fileMD5;
    }

    public CreateModelRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateModelRequest setModelScene(String modelScene) {
        this.modelScene = modelScene;
        return this;
    }
    public String getModelScene() {
        return this.modelScene;
    }

    public CreateModelRequest setParameterNum(String parameterNum) {
        this.parameterNum = parameterNum;
        return this;
    }
    public String getParameterNum() {
        return this.parameterNum;
    }

    public CreateModelRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateModelRequest setUserLocalFileName(String userLocalFileName) {
        this.userLocalFileName = userLocalFileName;
        return this;
    }
    public String getUserLocalFileName() {
        return this.userLocalFileName;
    }

}
