package cn.dblearn.blog.portal.blog.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 标签
 * </p>
 *
 * @author bobbi
 * @since 2018-11-07
 */
@Data
@ApiModel(value="BlogTag对象", description="标签")
public class BlogTag implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tag_id", type = IdType.AUTO)
    private Integer tagId;

    @ApiModelProperty(value = "标签名字")
    private String tagName;

    @ApiModelProperty(value = "关联父Id")
    private Integer parentId;

    private Date createTime;

    private Date updateTime;


}
