// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class UploadTranslationFileRequest extends TeaModel {
    /**
     * <p>The API key that identifies the identity of the member accounts. You can obtain it from the RuiYiBao console.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-2***s</p>
     */
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>The file. The SDK supports direct upload and temporary authorized upload.</p>
     * <ul>
     * <li><strong>Direct upload</strong>: Use UploadTranslationFileAdvance in the SDK for direct upload. The Java field type is InputStream, and the Python type is BinaryIO.</li>
     * <li><strong>Temporary authorized upload</strong>: Use AuthorizeFileUpload and UploadTranslationFile in the SDK for temporary authorized upload.<ul>
     * <li>Step 1: Call AuthorizeFileUpload to obtain a temporary OSS upload credential, then upload the file to obtain the complete file URL.</li>
     * <li>Step 2: Call UploadTranslationFile and pass the URL to the File field.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notes on temporary authorized upload</p>
     * <ul>
     * <li>You need to additionally import OpenPlatform(2019-12-19) - AuthorizeFileUpload to obtain a temporary OssPolicy. For information about how to upload files, refer to <a href="https://www.alibabacloud.com/help/en/oss/user-guide/uploading-objects-to-oss-directly-from-clients/">Upload objects directly from clients to OSS</a>.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>File size limit</p>
     * <ul>
     * <li>The maximum file size is 500 MB.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://gtm-pop-file-upload-zhangjiakou.oss-cn-zhangjiakou.aliyuncs.com/467a_208353582454045230_c8a22285d0b14873aefdcb7eaa7f9046">http://gtm-pop-file-upload-zhangjiakou.oss-cn-zhangjiakou.aliyuncs.com/467a_208353582454045230_c8a22285d0b14873aefdcb7eaa7f9046</a></p>
     */
    @NameInMap("File")
    public String file;

    /**
     * <p>The name of the uploaded file.</p>
     * <p><notice>Make sure the correct file name (including the extension) is provided. Otherwise, file parsing will fail.</notice></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testfile_202511.txt</p>
     */
    @NameInMap("FileName")
    public String fileName;

    public static UploadTranslationFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadTranslationFileRequest self = new UploadTranslationFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadTranslationFileRequest setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public UploadTranslationFileRequest setFile(String file) {
        this.file = file;
        return this;
    }
    public String getFile() {
        return this.file;
    }

    public UploadTranslationFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
